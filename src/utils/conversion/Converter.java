package utils.conversion;
 
public class Converter {
public static String weightKg(Double n)
{
    Double wt = n*0.4536;
    return (wt+" Kg");
}
public static String tempF(Double c)
{
    Double F = (c*9/5)+32;
    return (F+" F");
}
public static String timeHr(int t)
{
    int h = t/3600;
    t = t%3600;
    int min = t/60;
    int s = t%60;
    return (h+"h"+min+"m"+s+"s");
}
}