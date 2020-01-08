import java.util.Scanner;

public class PossibleGame {
    public static void main(String[] args) {

        // Austin Schweickert - 9/17/19
        // This is based off a fictional setting with the theme of "S.C.P.F.", which is Special Containment Procedures Foundation. More information can be found by googling "SCPF"

        Scanner keyboard = new Scanner(System.in);
        
        // Variables

        // Construction Variables
        String thickBarrier, dottedBarrier, failed, emptyLine;
        // User Choices (They recieve input from scanner.)
        String userChoice1, userChoice2, userChoice3, userChoice4, userChoice5;
        // Options that tell the results.
        String result1A, result1B, result1C, result2A, result2B, result3A, result3B, result4A, result4B, result5A, result5B;

        // Construction Variables

        thickBarrier = ("---------------------------------------------------------------------------");
        dottedBarrier = ("- - - - - - - - - - - - - - - - - - - - - - - -");
        failed = ("- You Died -");
        emptyLine = ("                           ");

        // Result Variables

        result1A = ("Door_A");
        result1B = ("Door_B");
        result1C = ("Wait");

        result2A = ("Channel_A");
        result2B = ("Channel_B");

        result3A = ("Hatch");
        result3B = ("Hallway");

        result4A = ("Left");
        result4B = ("Right");

        result5A = ("Package_A");
        result5B = ("Package_B");
        
        // Actual code

        System.out.println(emptyLine);
        System.out.println(thickBarrier);
        System.out.println("Hello person! This code is a WIP (Work in Progress)! Please keep this in mind while playing. This game is completely chance based until further notice so it is recommended to take not of your choices and results.");
        System.out.println(thickBarrier);
        System.out.println(emptyLine);
        
        System.out.println(thickBarrier);
        System.out.println("You wakeup in a mysterious room with two doors. You can't seem to remember how you got here or even your name for that matter. Although with struggling memory you get a feeling you are not safe. You know you need to find a way out. Do you want to choose Door_A, Door_B, or possibly Wait instead to see if anyone comes.");
        System.out.println(thickBarrier);
        System.out.println(emptyLine);
        userChoice1 = keyboard.next();
        System.out.println(emptyLine);

        // Survive
        if (userChoice1.equals(result1B)) {
            System.out.println(thickBarrier);
            System.out.println("You choose to enter Door_B, within is another room but with what looks to be a walkie-talkie on the table.");
            System.out.println("As you walk over and pick it up, you see there are is a note with it. The note contains two radio channels. Above each channel there are symbols that look like Chinese characters.");
            System.out.println("You try other frequecys but all you get is static. Do you try Channel_A first or Channel_B?");
            System.out.println(thickBarrier);
            System.out.println(emptyLine);
            userChoice2 = keyboard.next();
            System.out.println(emptyLine);

            // Survive
            if (userChoice2.equals(result2A)) {
                System.out.println(thickBarrier);
                System.out.print("You try Channel_A, you pick it up and speak into the radio, you hear someone on the other side. The voice seems familiar but you fail to remember anything outside of this new place. You suddenly realise the voice is repeating some instuctions over and over. You listen and you hear them say to return to the last room and go through the other door.");
                System.out.print("You follow the instructions and return to the other room to open the door, just before you open it you hear a explosion behind the door, quickly followed by heavy footsteps, yelling, and gun shots. All of this only lasts for about 10 seconds before the heavy footsteps get distant. After this you run back to the radio to still hear the same repeating instructions.");
                System.out.print("You decide to wait a while longer before returning to the other room and to the door. Finally you gain the courage to open the door as the instructions had insisted. Within you see what looks like a warzone. After the sounds coming from the room earlier you are not very suprised but you are indeed scared.");
                System.out.print("Within the room there is a doorway wich looks to be leading out into a long hallway and a large iron door in the center of the room along with what seems to be two dead soldiers. They are both in different uniform and are very well equipped but you fail to figure out who they are or where they came from.");
                System.out.print("You notice in the corner of the room is a metal hatch which is locked by one of the turning wheels. Ignoring this but keeping it in mind, you decide to grab one of the soldiers guns but it is like nothing you have ever seen before. It is lightweight and glowing?? You decide to just put the gun over your shoulder with the strap and continue on but first you must choose where you wish to go.");
                System.out.println("You have two choices from here, you can choose the Hallway in a attempt to follow the soldiers or the Hatch.");
                System.out.println(thickBarrier);
                System.out.println(emptyLine);
                userChoice3 = keyboard.next();
                System.out.println(emptyLine);

                // Survive
                if (userChoice3.equals(result3A)) {
                    System.out.println(thickBarrier);
                    System.out.print("You decide to go with the hatch. Even if you did attempt to follow the soldiers who knows if they are friendly or not. You walk over and twist the lock on the hatch and pull it open with the last bit of strength inside you. You peer down and see a dimmly lit ladder going for about 20 feet down.");
                    System.out.print("You climb down the ladder into what looks to be a maintence hall. Although it smells terrible you know you must push on in fear of being caught by someone who wouldn't appreciate what he is currently doing.");
                    System.out.print("There are two directions to go from here, both leading to a corner that appears to continue the hall.");
                    System.out.println("You need to decide which direction to go. Do you choose Left or Right?");
                    System.out.println(thickBarrier);
                    System.out.println(emptyLine);
                    userChoice4 = keyboard.next();
                    System.out.println(emptyLine);

                    // Survive
                    if (userChoice4.equals(result4B)) {
                        System.out.println(thickBarrier);
                        System.out.print("You choose to go to the right. As you walk down the narrow, dim hallway, you hear what can only be described as a roar from some sort of creature. It didn't sound like it came from earth. This is when you hear the large footsteps coming towards you at light speeds. At this point you dash for the corner and turn around it without looking back to see the source of the roar, around the corner there is a hallway that goes on for what seems to be a mile...");
                        System.out.print("You spot a door on the left hand side of the hallway and make a mad dash to it. As you reach the doorway you throw yourself inside without thinking in fear of whatever creature made that noise. As you slam the door behind you, you hear giant thuds go flying by the door followed by another hideous roar coming from where the footsteps were heading.");
                        System.out.print("Finally, you decide to turn around to see you are in what looks to be a small cafeteria/break room. Within you see the classic table setup and where a worker would serve food. At the sight of all of this and seeing nobody around along with no new signs of the creature, you decide to grab a bite to eat. You did not feel hungry at first but as soon as you went behind the large double doors to behind the serving station, all you can see are shelves of various packages of meals.");
                        System.out.println("The only way you can tell these are still meals is by the medium sized sign labeled \"Meals Ready To Eat.\" As you search the isles you find two of what seem to be the quality of them all. They don't have specific names but only what seems to be a ID number. These two packages have the nicest packaging and are considerably larger than the others. You have to make a choice of which one to have. Do you wish to choose Package_A or Package_B?");
                        System.out.println(thickBarrier);
                        System.out.println(emptyLine);
                        userChoice5 = keyboard.next();
                        System.out.println(emptyLine);

                        // Survive
                        if (userChoice5.equals(result5A)) {
                            System.out.println(thickBarrier);
                            System.out.println("You choose Package_A. You set Package_B back where you found it and take Package_A back to the main room with the tables and benches. You go in and quickly scan the room again to be safe. Finally sitting down and relaxing you tear open the package only to find what looks to be a squashed salad and a tiny sandwich inside. ");
                            System.out.println(thickBarrier);
                            System.out.println(emptyLine);
                        }

                        // Fail
                        if (userChoice5.equals(result5B)) {
                            System.out.println(thickBarrier);
                            System.out.print("WIP - You Died.");
                        }
                    }

                    // Fail
                    if (userChoice4.equals(result4A)) {
                        System.out.println(thickBarrier);
                        System.out.print("You choose to go to the left. As you walk down the hallway the air around you suddenly gets hotter... You consider turning around but a sudden blast of air knocks you on your back, knocking the wind out of you. As you struggle to regain your breath and find the source, large thuds begin down the hallyway in your direction. Panicking you get up but you still struggle to breathe. Ahead of you... Its something best described as a giant lizard... Its eyes glowed a soft green as it started to run towards you, but you stand still, unable to move due to a mixture of shock and fear. You stare into the monster's eyes as it charges you. The last thing you see is the monster opening its mouth and closing it around your torso. As you feel your insides get crushed and your ribs snap, your sight turns into darkness. You Died.");
                    }
                }

                // Fail
                if (userChoice3.equals(result3B)) {
                    System.out.println(thickBarrier);
                    System.out.print("You decide that following the soldiers or trying to find help will be your best shot at getting out of this terrifying place. You poke you head out into the hallway to see a man in a white military uniform who quickly spots you. He shouts something and then begins to raise his gun but you duck behind the cover of the doorway as you hear heavy boots aproaching your doorway. The man looked as if he was in a snowy form of riot armor but the symbol on the vest was nothing like you had ever seen. In the panic like state you were in, you completly forgot about the weapon on your back. While puzzling about this man and wondering what he should do, the geared man pops around the corner. Before you could scream you were in a pool of your own blood. You Died.");
                }
            }
            // Fail
            if (userChoice2.equals(result2B)) {
                System.out.println(thickBarrier);
                System.out.println("You try Channel_B, you pick it up and speak into the radio, you suddenly hear the door from the last room slam open but as you turn around to see what emerged, all you can hear are gunshots as your chest turns bright red. You try to turn to see your killer before you collapse but the life is sucked out of you and everything goes dark as you hit the floor. You Died.");
            }
        }

        // Fail
        if (userChoice1.equals(result1A)) {
            System.out.println(thickBarrier);
            System.out.println("You choose to enter Door_A, within is a heavily armed soldier standing by a table with two monitors who quickly yells \"The lock failed!\". He raises his gun in your direction and the next thing you know, the walls behind you is painted with red as if a artist had spilled a bucket of paint. You nearly instantly collapse while everything goes dark. You Died.");
        }
        // Fail
        if (userChoice1.equals(result1C)) {
            System.out.println(thickBarrier);
            System.out.println("You choose to wait, as you sit in the room waiting for something to happen you suddenly feel very sleepy... As you slip into unconsiousness you see one of the doors open to reveal what looks to be a shadowy figure in a military outfit. Everything goes dark. You Died.");
        }

    }
}