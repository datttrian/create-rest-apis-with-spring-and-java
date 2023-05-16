public class MadLibs {
  /*
  This program captures user input
  and interpolates it into a Mad
  Lib story.
  Author: Friendly Neighborhood
  Curriculum Developer
  */
	public static void main (String[] args) {
    String name1 = "Marcus";
    String adjective1 = "tired";
    String adjective2 = "tiresome";
    String noun2 = "candy";
    String noun3 = "beat";
    String verb1 = "dance";
    String noun1 = "beat";
    String noun4 = "watchers";
    String adjective3 = "angry";
    String name2 = "James";
    String place1 = "work";
    String noun5 = "gunk";
    int number = 2055;
    String noun6 = "Apes";
    
    // The template for the story
    String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
    System.out.println(story);
  }       
}
