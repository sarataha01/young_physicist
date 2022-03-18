package tester;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import org.junit.*;

public class phyTest
{
    @Test
    public void equilibrium(){
        phy mat = new phy();
        int[][] a1 = { {3, -1, 7}, {-5, 2, -4}, {2, -1, -3} };
        assertEquals("Equilibrium",1,mat.equilibrium(a1));
    }

    @Test
    public void equilibrium1(){
        phy mat1 = new phy();
        int[][] a2 = { {4, 1, 7}, {-2, 4, -1}, {1, -5, -3} };
        assertEquals("Not Equilibrium",-1,mat1.equilibrium(a2));
    }

    @Test
    public void equilibrium2(){
        phy mat1 = new phy();
        int[][] a3 = { {1, 0, 0}, {0, 1, 0}, {0, 0, 1} };
        assertEquals("Not Equilibrium",-1,mat1.equilibrium(a3));
    }

}