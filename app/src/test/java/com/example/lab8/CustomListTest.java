package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


//import org.junit.Before;
import android.content.Context;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList mockList() {
        return new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void testCustomListAdd() {
        // Create new CustomList
        CustomList customList = mockList();

        // Check there's no items in list
        assertEquals(0, customList.getCount());

        // Add new item
        customList.addCity(new City("New York", "NY"));

        // Check item was added
        assertEquals(1, customList.getCount());
    }

    @Test
    public void testCustomListRemove() {
        // Create new CustomList
        CustomList customList = mockList();

        // Add item to list
        City city = new City("New York", "NY");
        customList.addCity(city);

        // Remove item
        customList.removeCity(city);

        // Check item was removed
        assertEquals(0, customList.getCount());

    }


    @Test
    public void testCustomListHasCity() {
        // Create new CustomList
        CustomList customList = mockList();

        // Create City object
        City city = new City("New York", "NY");

        // Check that city not in list
        assertNotEquals(true, customList.hasCity(city));

        // Add city to list
        customList.addCity(city);

        // Check that city is in list
        assertEquals(true, customList.hasCity(city));
    }




}
