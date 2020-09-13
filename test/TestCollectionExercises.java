import collectionExercises.CollectionExercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestCollectionExercises {
    CollectionExercises customCol = new CollectionExercises();

    @Test
    public void testTotalVowels(){
        ArrayList<String> a = new ArrayList<>();
        a.add("hello");
        a.add("what up");
        a.add("hello");
        a.add("what up");
        a.add("what up");
        a.add("hi");
        a.add("yo");
        a.add("sup");
        a.add("hejsa");
        int vow = customCol.totalVowels(a);
        assertEquals(15, vow);
    }
    @Test
    public void testCountUnique(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(-1);
        list.add(3);
        assertEquals(4, customCol.countUnique(list));
    }
    @Test
    public void testMinLength(){
        Set<String> words = new HashSet<>();
        words.add("hello");
        words.add("hi");
        words.add("what up");
        words.add("yo");
        words.add("sup");
        words.add("hejsa");
        assertEquals(2, customCol.minLength(words));
    }
    @Test
    public void testRemoveOdd(){
        Set<String> words = new HashSet<>();
        words.add("hello");
        words.add("hi");
        words.add("what up");
        words.add("yo");
        words.add("sup");
        words.add("hejsa");
        assertEquals(2, customCol.removeOddLength(words).size());
    }
    @Test
    public void testCount3(){
        ArrayList<String> a = new ArrayList<>();
        a.add("hello");
        a.add("what up");
        a.add("hello");
        a.add("what up");
        a.add("what up");
        a.add("hi");
        a.add("yo");
        a.add("sup");
        a.add("hejsa");
        assertTrue(customCol.count3(a));
    }
    @Test
    public void testIsUnique(){
        HashMap<String, String> names = new HashMap<>();
        names.put("Deji", "Ehinlanwo");
        names.put("dave", "Ehinlanwo");
        names.put("john", "Travolta");
        names.put("Sam", "Jackson");
        names.put("Morgan", "Freeman");
        names.put("jesus", "christ");
        assertFalse(customCol.isUnique(names));
    }
}

