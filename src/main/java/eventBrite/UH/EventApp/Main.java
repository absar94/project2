package eventBrite.UH.EventApp;

import eventBrite.UH.EventCreate.EventCreate;
import eventBrite.UH.UserAccount.SignUp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static ArrayList<String> featureList = new ArrayList<String>(Arrays.asList(
            "create user account", "login", "create event"));

    public static void main(String[] args) {

        Scanner selectFeature = new Scanner(System.in);

        for(int ftcpt = 0; ftcpt < featureList.size(); ftcpt ++)
        {
            System.out.println("input "+ ftcpt +" to access feature "+ featureList.get(ftcpt));
        }

        System.out.println();
        System.out.println("please input the feature you want to perform");

        int select = Integer.parseInt(selectFeature.nextLine());

        switch (featureList.get(select))
        {
            case "create user account":
                System.out.println("you started "+featureList.get(select));
                // instantiate and call feature class here
                Signup eCreate = new SignUp(selectFeature);
            
                break;
            case "login":
                System.out.println("you started "+featureList.get(select));
                // instantiate and call feature class here
                break;
            case "create event":
                System.out.println("you started "+featureList.get(select));
                // instantiate and call feature class here
                EventCreate eCreate = new EventCreate(selectFeature);
                eCreate.createEvent();
                break;
        }




    }
}
