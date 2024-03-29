package com.springframework.didemo.practice;

import com.springframework.didemo.practise.ToyBuilder;
import com.springframework.didemo.practise.ToyCar;
import com.springframework.didemo.practise.ToyHouse;
import com.springframework.didemo.practise.ToyPlane;
import org.junit.Test;

public class ToyBuilderTest {
   @Test
    public void testBuildToyHouse() throws Exception{
       ToyHouse toyHouse= ToyBuilder.buildToyHouse();
       System.out.println(toyHouse);
    }

    @Test
    public void testBuildToyCar() throws Exception{
        ToyCar toyCar=ToyBuilder.buildToyCar();
        System.out.println(toyCar);
    }
    @Test
    public void testBuildToyPlane() throws Exception{
        ToyPlane toyPlane=ToyBuilder.buildToyPlane();
        System.out.println(toyPlane);
    }
}
