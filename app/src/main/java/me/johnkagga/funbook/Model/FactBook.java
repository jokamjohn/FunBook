package me.johnkagga.funbook.Model;

/**
 * Created by John Kagga on 7/5/2015.
 */
public class FactBook {

    /*
    Body facts
     */

    private FactPage [] mFactPage;

    public FactBook () {
        mFactPage = new FactPage[11];
        /*
        setting the facts
         */
        mFactPage[0] = new FactPage("Fact 1","Your brain is your hungriest organ! 20% of what you eat feeds it.","#39add1",
                new Choice("Eyes",1),new Choice("Digestive System",2));

        mFactPage[1] = new FactPage("Fact 2","Your eyes always close when you sneeze","#3079ab",
                new Choice("Fact name",3),new Choice("next fact name",4));

        mFactPage[2] = new FactPage("Fact 3","Your digestive system will process around 50 tonnes(50,000kgs) of food in your lifetime.","#c25975",
                new Choice("Fact name",5),new Choice("next fact name",6));

        mFactPage[3] = new FactPage("Fact 4","You have more than 230 joints in your body.","#e15258",
                new Choice("Fact name",7),new Choice("next fact name",8));

        mFactPage[4] = new FactPage("Fact 5","You use 72 muscles when you talk","#f9845b",
                new Choice("Fact name",1),new Choice("next fact name",2));

        mFactPage[5] = new FactPage("Fact 6","On average right-handed people live nine years longer than left-handed people!.","#838cc7",
                new Choice("Fact name",1),new Choice("next fact name",2));

        mFactPage[6] = new FactPage("Fact 7","You are hairy all over, Only your lips, palms and soles of your feet have no hair on them-the rest of your body is covered in around five million hairs.","#7d669e",
                new Choice("Fact name",1),new Choice("next fact name",2));

        mFactPage[7] = new FactPage("Fact 8","You lose 47% of your body`s heat from your head.That`s why you should wear a hat if it`s chilly.","#53bbb4",
                new Choice("Fact name",1),new Choice("next fact name",2));

        mFactPage[8] = new FactPage("Fact 9","Your thighbone is the longest bone in your body.","#51b46d",
                new Choice("Fact name",1),new Choice("next fact name",2));

        mFactPage[9] = new FactPage("Fact 10","Fingernails grow four times more quickly than toenails.","#e0ab18",
                new Choice("Fact name",1),new Choice("next fact name",2));

        mFactPage[10] = new FactPage("Fact 11","Your hair grows more quickly in warm weather than in cold weather.","#637a91",
                new Choice("Fact name",1),new Choice("next fact name",2));
    }
    /*
    method to get the fact page
     */
    public FactPage getPage (int pageNumber){
        return mFactPage[pageNumber];
    }
}


