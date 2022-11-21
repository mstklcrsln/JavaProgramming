package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1= new Offer();
        Offer offer2= new Offer();


      // System.out.println(offer1); Offer{location='null', companyName='null', jobTitle='null', salary=0.0, hasBenefit=false, hasPTO=false, isWHF=false, isFullTime=false}

        offer1.setInfo("VA", "Amazon Inc","SDET", 110000,true,true,true,true);

       // System.out.println(offer1); Offer{location='VA', companyName='Amazon Inc', jobTitle='SDET', salary=110000.0, hasBenefit=true, hasPTO=true, isWHF=true, isFullTime=true}

        offer2.setInfo("California", "Sony", "QA", 120000,true,false,false,true);

       // System.out.println(offer2); Offer{location='California', companyName='Sony', jobTitle='QA', salary= $120000.0, hasBenefit=true, hasPTO=false, isWHF=false, isFullTime=true}


        Offer offer3= new Offer();
        offer3.setInfo("FL", "Apple", "QE", 125000, true,true,true,false);

        Offer offer4= new Offer();
        offer4.setInfo("TX","CapitalOne", "SM", 115000,false,false,true,true );

        Offer offer5= new Offer();
    offer5.setInfo("WA", "Bank of America", "BA", 130000, true,true,false,true);



        // we put 5 offer into one array
        Offer [] myOffers= {offer1, offer5, offer4,offer2, offer3};
        // we put all them to an Arraylist
     //   2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
       // 2.3.1 Write a program that can remove the offer objects that are not full-time
        ArrayList<Offer> fullTimeOffers= new ArrayList<>(Arrays.asList(myOffers));
        // we use removeIf method to check only fullTime
        fullTimeOffers.removeIf(p-> !p.isFullTime ); //p represents each of the offer in the arraylist. This code removes if the offer is not full time, only full time we have left
        System.out.println(fullTimeOffers.size()); // 4 of them are fulltime


        //	2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
        //						2.4.1 Write a program that can remove all the offers that are not from local

        ArrayList<Offer> localOffers= new ArrayList<>(Arrays.asList(myOffers));

        localOffers.removeIf(p-> !p.location.equals("VA"));
        System.out.println(localOffers.size()); //1

        for (Offer each : localOffers) {
            System.out.println(each.companyName+ " : "+ each.salary); //Amazon Inc : 110000.0
        }
    }
}
/*
2. Create a class named MyOffers:

				2.1 Create 7 objects of Offer
				2.2 Create an array of Offers named myOffers and store all 7 objects of offers
				2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
						2.3.1 Write a program that can remove the offer objects that are not full-time
				2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
						2.4.1 Write a program that can remove all the offers that are not from local
				2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
						2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
				2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
						2.6.1 Write a program that can remove all the offers that are not for SDET
				2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
						2.7.1 Write a program that can remove all the offers that are offering less than 100K salary

 */