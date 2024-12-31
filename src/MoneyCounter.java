import java.util.Scanner;
import java.text.DecimalFormat;

class MoneyCounter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();

        boolean showSystemProperties;

        System.out.println("\n\nCoin and Bill Counter!");
        System.out.println("\nEnter the number of each type of denomination you possess");
        System.out.println("\nGet your total in your currency!");

        System.out.println("\n\nEnter currency type:");
        System.out.println("1. $ United States Dollar (USD)");
        System.out.println("2. C$ Canadian Dollar (CAD)");
        System.out.println("3. € Euro (EUR)");
        System.out.println("4. ₹ Indian Rupee (INR)");
        System.out.println("Want another currency? Contact me on Slack! I am planning on adding more soon!");

        int currency = sc.nextInt();

        float total = 0;
        int current;
        int modeDollar = 0;
        int modeEuroRupee = 0;

        System.out.println("\n\nModes");
        System.out.print("\n1. Coins Only");
        System.out.print("\n2. Bills Only");
        System.out.print("\n3. Coins and Bills");

        if (currency == 1 || currency == 2)
            modeDollar = sc.nextInt();
        else if (currency == 3 || currency == 4)
            modeEuroRupee = sc.nextInt();


        switch (modeDollar)
            {
            //Coins
            case 1:
            //Coins + Bills
            case 3:
                {
                System.out.println("\n\nEnter number of Pennies (1¢)");
                current = sc.nextInt();
                total += (float) current / 100;

                System.out.println("\n\nEnter number of Nickles (5¢)");
                current = sc.nextInt();
                total += (float) current / 20;

                System.out.println("\n\nEnter number of Dimes (10¢)");
                current = sc.nextInt();
                total += (float) current / 10;

                System.out.println("\n\nEnter number of Quarters (25¢)");
                current = sc.nextInt();
                total += (float) current / 4;

                System.out.println("\n\nEnter number of Half-Dollars (50¢)");
                current = sc.nextInt();
                total += (float) current / 10;

                if (currency == 1)
                    {
                    System.out.println("\n\nEnter number of Dollar Coins ($1)");
                    }
                else if (currency == 2)
                    {
                    System.out.println("\n\nEnter number of Loonies / Silver Dollars ($1)");
                    }
                current = sc.nextInt();
                total += (float) current;

                if (currency == 2)
                    {
                    System.out.println("\n\nEnter number of Toonies ($2)");
                    current = sc.nextInt();
                    total += (float) current * 2;
                    }


            //if case is 1 -> Break before Bills
                if (modeDollar == 1)
                    {
                    break;
                    }
                }



            //Bills
            case 2:
                {
                if (currency == 1)
                    {
                    System.out.println("\n\nEnter number of Dollar Bills ($1)");
                    current = sc.nextInt();
                    total += (float) current;

                    System.out.println("\n\nEnter number of Two Dollar Bills ($2)");
                    current = sc.nextInt();
                    total += (float) current * 2;
                    }

                System.out.println("\n\nEnter number of Five Dollar Bills ($5)");
                current = sc.nextInt();
                total += (float) current * 5;

                System.out.println("\n\nEnter number of Ten Dollar Bills ($10)");
                current = sc.nextInt();
                total += (float) current * 10;

                System.out.println("\n\nEnter number of Twenty Dollar Bills ($20)");
                current = sc.nextInt();
                total += (float) current * 20;

                System.out.println("\n\nEnter number of Fifty Dollar Bills ($50)");
                current = sc.nextInt();
                total += (float) current * 50;

                System.out.println("\n\nEnter number of Hundred Dollar Bills ($100)");
                current = sc.nextInt();
                total += (float) current * 100;
                }
            break;
            default:
            }






        //No Dollarized Names
        switch (modeEuroRupee)
            {
            //Coins
            case 1:
                //Coins + Bills
            case 3:
            {
            //Euro Coins (diff than Indian)
            if (currency == 3)
                {
                System.out.println("\n\nEnter number of 1 Euro Cent Coins (€0.01)");
                current = sc.nextInt();
                total += (float) current / 100;

                System.out.print("\n\nEnter number of 2 Euro Cent Coins (€0.02)");
                current = sc.nextInt();
                total += (float) current / 50;

                System.out.println("\n\nEnter number of 5 Euro Cent Coins (€0.05)");
                current = sc.nextInt();
                total += (float) current / 20;

                System.out.println("\n\nEnter number of 10 Euro Cent Coins (€0.10)");
                current = sc.nextInt();
                total += (float) current / 10;

                System.out.println("\n\nEnter number of 20 Euro Cent Coins (€0.20)");
                current = sc.nextInt();
                total += (float) current / 5;

                System.out.println("\n\nEnter number of 50 Euro Cent Coins (€0.50)");
                current = sc.nextInt();
                total += (float) current / 2;


                System.out.println("\n\nEnter number of Euro Coins (€1)");
                current = sc.nextInt();
                total += (float) current;

                System.out.println("\n\nEnter number of Two Euro Coins (€2)");
                current = sc.nextInt();
                total += (float) current * 2;
                }

            else if (currency == 4)
            //Indian
                {
                System.out.println("\n\nMany of you may have old Paisa... unfortunately most of them have lost legal " +
                        "tender status, and are thus not included.");

                System.out.print("\n\nEnter number of 50 Paise Coins (₹0.50)");
                current = sc.nextInt();
                total += (float) current / 2;

                System.out.print("\n\nEnter number of 1 Rupee Coins (₹1)");
                current = sc.nextInt();
                total += (float) current;

                System.out.print("\n\nEnter number of 2 Rupee Coins (₹2)");
                current = sc.nextInt();
                total += (float) current * 2;

                System.out.println("\n\nEnter number of 5 Rupee Coins (₹5)");
                current = sc.nextInt();
                total += (float) current * 5;

                System.out.println("\n\nEnter number of 10 Rupee Coins (₹10)");
                current = sc.nextInt();
                total += (float) current * 10;

                System.out.println("\n\nEnter number of 20 Rupee Coins (₹20)");
                current = sc.nextInt();
                total += (float) current * 20;
                }

            //if case is 1 -> Break before Bills
            if (modeEuroRupee == 1)
                {
                break;
                }
            }



            //Bills
            case 2:
            {

            if (currency == 3)
                {
                System.out.println("\n\nEnter number of Five Euro Bills (€5)");
                current = sc.nextInt();
                total += (float) current * 5;
                }


            if (currency == 3)
                System.out.println("\n\nEnter number of Ten Euro Bills (€10)");
            if (currency == 4)
                System.out.println("\n\nEnter number of Ten Rupee Bills (₹10)");
            current = sc.nextInt();
            total += (float) current * 10;

            if (currency == 3)
                System.out.println("\n\nEnter number of Twenty Euro Bills (€20)");
            if (currency == 4)
                System.out.println("\n\nEnter number of Twenty Rupee Bills (₹20)");
            current = sc.nextInt();
            total += (float) current * 20;

            if (currency == 3)
                System.out.println("\n\nEnter number of Fifty Euro Bills (€50)");
            if (currency == 4)
                System.out.println("\n\nEnter number of Fifty Rupee Bills (₹50)");
            current = sc.nextInt();
            total += (float) current * 50;

            if (currency == 3)
                System.out.println("\n\nEnter number of Hundred Euro Bills (€100)");
            if (currency == 4)
                System.out.println("\n\nEnter number of Hundred Rupee Bills (₹100)");
            current = sc.nextInt();
            total += (float) current * 100;

            if (currency == 3)
                System.out.println("\n\nEnter number of Two Hundred Euro Bills (€200)");
            if (currency == 4)
                System.out.println("\n\nEnter number of Two Hundred Rupee Bills (₹200)");
            current = sc.nextInt();
            total += (float) current * 200;

            if (currency == 3)
                System.out.println("\n\nEnter number of Five Hundred Euro Bills (€500)");
            if (currency == 4)
                System.out.println("\n\nEnter number of Five Hundred Rupee Bills (₹500)");
            current = sc.nextInt();
            total += (float) current * 500;

            if (currency == 4)
                {
                System.out.println("\n\nEnter number of Thousand Rupee Bills (₹1000)");
                System.out.println("***Note that this bill is no longer legal tender... enter 0 if looking for real " +
                        "value, and not collectors.");
                current = sc.nextInt();
                total += (float) current * 1000;

                System.out.println("\n\nEnter number of Two Thousand Rupee Bills (₹2000)");
                System.out.println("***Note that this bill is no longer legal tender... enter 0 if looking for real " +
                        "value, and not collectors.");
                current = sc.nextInt();
                total += (float) current * 2000;
                }
            break;
            }
            default:
            }

        //Currency Sign
        String cSign = switch (currency)
            {
            case 1, 2 -> "$";
            case 3 -> "€";
            case 4 -> "₹";
            default -> "Error - Currency Sign Not Yet Programmed!";
            };

        //Total
        System.out.println("\n\n\nTotal");
        System.out.println("_________");
        System.out.println(cSign + df.format(total));


        //System.out.println("\n\nThis Project has been precompiled into a jar file for ease of use (Available in " +"/out/artifacts/ folder of src)! ");
        // PreCompiled File was Deleted due to it printing out personal information and me being to lazy to change it :3

        showSystemProperties = true;

        //Resolution
        if (showSystemProperties)
            {
            System.out.println("\n\n\n");
            System.out.println("Java Version: " + System.getProperty("java.version") + " by " + System.getProperty("java.vendor"));
            System.out.println("User: " + System.getProperty("user.name"));  //<-- TURNED OFF FOR PRIVACY IN THE VIDEO
            System.out.print("Operating System: " + System.getProperty("os.name"));
            System.out.println(" " + System.getProperty("os.version"));
            System.out.println("Architecture: " + System.getProperty("os.arch"));
            System.out.println ("By: Blu");
            System.out.println ("Coded for Hack Club High Seas on December 29th 2024");
            }
    }
}
