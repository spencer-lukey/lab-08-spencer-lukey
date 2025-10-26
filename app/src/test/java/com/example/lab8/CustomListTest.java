package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import android.content.Context;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private Context mockContext;

    private CustomList mockList() {
        return new CustomList(mockContext, new ArrayList<City>());
    }

    @Test
    public void testCustomListAdd() {
        // Create new CustomList
        CustomList customList = mockList();

        // Check there's no items in list
        assertEquals(0, customList.getCount());

        // Add new item
        customList.add(new City("New York", "NY"));

        // Check item was added
        assertEquals(1, customList.getCount());
    }

}
