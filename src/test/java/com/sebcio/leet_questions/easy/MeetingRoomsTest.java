package com.sebcio.leet_questions.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MeetingRoomsTest {

    @Test
    void shouldReturnCorrectValue(){
        //given
        Interval[] falseIntervals = new Interval[] {new Interval(0 , 30), new Interval(5 , 20), new Interval(15 , 20)};
        Interval[] trueIntervals = new Interval[] {new Interval(7 , 10), new Interval(2 , 4)};
        Interval[] emptyArray = new Interval[] {};
        

        //then
        assertThat(MeetingRooms.canAttendMeetings(falseIntervals)).isFalse();
        assertThat(MeetingRooms.canAttendMeetings(trueIntervals)).isTrue();
        assertThat(MeetingRooms.canAttendMeetings(emptyArray)).isTrue();


    }
}
