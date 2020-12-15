package com.company;

public class AdressSplit
{
    public String adress = "Россия,86,Нижневартовск,Механиков,11,3,2";
    public String adress1 = "Россия,77,Москва,Ленина,17,1,5";
    public String adress2 = "Россия,77,Москва,Маяковская,12,2,7";
    public String adress3 = "Россия,66,Екатеринбург,Северная,23,11,3";
    void splitAndShowAdress()
    {
        String[] words = adress.split(",");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println();
            String[] words1 = adress1.split(",");
            for (String word1 : words1) {
                System.out.println(word1);
            }
        System.out.println();
                String[] words2 = adress2.split(",");
                for (String word2 : words2) {
                System.out.println(word2);
                }
        System.out.println();
                    String[] words3 = adress3.split(",");
                    for (String word3 : words3) {
                        System.out.println(word3);
                    }
    }
}
