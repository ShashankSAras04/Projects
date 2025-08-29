package com.Abstract.programs;
abstract class Train
{
    static void MetroTrain(String name)
    {
        System.out.println(name);
    }
    static void NormalTrain(String trainname)
    {
        System.out.println(trainname);
    }
}

public class AbstarctStaticMethodAlone {
    public static void main(String[] args) {

        Train.MetroTrain("BMRCL");
        Train.NormalTrain("Indian Railways");

    }
}
