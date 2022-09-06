package com.sebcio.leet_questions.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    @Test
    void shouldReturnCorrectValue(){
        assertThat(ProductOfArrayExceptSelf.productExceptSelf(new int[]{1,2,3,4})).isEqualTo(new int[]{24,12,8,6});
        assertThat(ProductOfArrayExceptSelf.productExceptSelf(new int[]{-1,1,0,-3,3})).isEqualTo(new int[]{0,0,9,0,0});
    }
}