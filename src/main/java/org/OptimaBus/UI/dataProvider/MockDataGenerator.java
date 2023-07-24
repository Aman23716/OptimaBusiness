package org.OptimaBus.UI.dataProvider;

import com.github.javafaker.Faker;

public class MockDataGenerator {

   Faker faker = new Faker();





    public String generateMockFirstname() {
        return faker.name().firstName();
    }

    public String generateMockLastName() {
        return faker.name().lastName();
    }

    public String generateMockEmail() {
        return faker.internet().emailAddress();
    }

    public String generateMockUsername() {
        return faker.name().username();
    }

    public Integer generateMockValue(){
        return faker.number().numberBetween(1,100000);

    }
//    public Integer generateMockValue2(){
//        return faker.number().randomDouble(1,100000,11111);
//
//    }

    public double generateMockValue1(){

        return faker.number().randomDouble(99,100, 10009);


    }



}
