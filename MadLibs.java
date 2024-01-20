public class MadLibs {
  /*
  This program generates a mad libbed story.
  Author: Maria Stewart
  Date: 10/30/23
  */
  	public static void main(String[] args){
      //names
      String name1 = "Amber";
      String name2 = "Brad";
      //adjectives
      String adjective1 = "grumpy";
      String adjective2 = "beautiful";
      String adjective3 = "tired";
      //nouns
      String noun1 = "school";
      String noun2 = "ring";
      String noun3 = "bed";
      String noun4 = "mom";
      String noun5 = "end table";
      String noun6 = "sink";
      //verbs
      String verb1 = "running";
      //places
      String place1 = "Maine";
      //number
      int number = 32;
        
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}
