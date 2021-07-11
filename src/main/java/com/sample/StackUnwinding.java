package com.sample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StackUnwinding {
    public static void main(String[] args) {

        Collection<Person> personCollection = new ArrayList<>();
        Person[] people = personCollection.toArray(new Person[0]);

        List<String> arrayList = new ArrayList<>();

        Collections.shuffle(arrayList);

        try{
            exceptionCall();
        }catch (Exception e){
            System.err.println( "Exception handled in main" );
        }
    }

    private static void exceptionCall() throws Exception {

        String substring = "dfd".substring(1, 2);

        try{
            System.out.println( "Method throwException" );
            throw new Exception();
        }catch (RuntimeException exception){
            System.err.println( "Exception handled in method throwException");
        } finally {
            System.err.println( "Finally is always executed" );
        }
    }
}
