package fueltank;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class consumeparametrizado {
       FuelTank tank = new FuelTank(60,50);
       @Parameterized.Parameters
       public static Iterable data(){
            return Arrays.asList(new Object[][]{{10,20},{15,35},{20,30},{35,45}});
        }

private int relleno;
private int esperado;


public consumeparametrizado(int relleno, int esperado) {
        this.relleno = relleno;
        this.esperado = esperado;
   }

@Test
    public void givenTwoNumbersShouldBeMultiplyResult(){
        tank.consume(relleno);
        double nivel=tank.getTankLevel();
        Assert.assertEquals(esperado,nivel,0.0);
    }
}