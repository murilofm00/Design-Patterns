package Util;
public class Random {
    public static int getRandomIntervalo(int min, int max){   
        return (int)(Math.random() * (max - min) + min);
    }
    
}
