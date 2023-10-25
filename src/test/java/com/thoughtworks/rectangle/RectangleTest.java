package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    
@Test

public void shouldReturnAreaWhenTheLengthAndBreadthAreGiven()
{
    Rectangle rt=new Rectangle(3.14,2.675);
    double area= rt.area();
    assertThat(area, is(closeTo(8.3995, 0.01)));
    double perimeter= rt.perimeter();
    assertThat(perimeter, is(closeTo(11.63, 0.01)));

}
}

