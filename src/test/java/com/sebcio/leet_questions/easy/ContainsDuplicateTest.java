package com.sebcio.leet_questions.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class ContainsDuplicateTest {

    private ContainsDuplicate containsDuplicate;

    @BeforeEach
    void setUp(){
        this.containsDuplicate = new ContainsDuplicate();
    }

    @Test
    @DisplayName("when null passed as argument method should return false")
    void containsDuplicateWithNullShouldReturnFalse() {
              
        assertThat(containsDuplicate.containsDuplicate(null)).isFalse();
    }

    @Test
    void containsDuplicateWithDataShouldReturnCorrect(){
        assertThat(containsDuplicate.containsDuplicate(new int[] {1,2,3,4,5,1})).isTrue();
        assertThat(containsDuplicate.containsDuplicate(new int[] {1,2,3})).isFalse();

    }

}
