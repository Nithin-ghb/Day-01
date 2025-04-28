public class Game
{
public static void ShowGameTitle()
{
System.out.println("Welcome to Adventure Quest!");
}
public static void ShowGameRules()
{
System.out.println("1.Collect coins");
System.out.println("2.Avoid obstacles");
System.out.println("3.Reach the goal");
}
public static void ShowLoadingScreen()
{
System.out.println("Loading game....Please wait");
}
public static void main(String[] args)
{
ShowGameTitle();
ShowGameRules();
ShowLoadingScreen();
}
}
