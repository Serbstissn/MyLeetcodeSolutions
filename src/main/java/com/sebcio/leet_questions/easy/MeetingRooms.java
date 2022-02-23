package com.sebcio.leet_questions.easy;

import com.sebcio.leet_questions.utils.Interval;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms {

    public static boolean canAttendMeetings(Interval[] intervals) {

        // sort in ascending order - complexity time: O(nlogn)
        Comparator<Interval> compareIntervals = (x, y) -> x.getStart() - y.getStart();

        Arrays.sort(intervals, compareIntervals);

        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i].getEnd() > intervals[i + 1].getStart())
                return false;
        }

        return true;
    }
}
