/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  //method to test keepOnlyBlue
  public static void testKeepOnlyBlue(){

    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();

  }

  //method to test negate
  public static void testNegate(){

    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();

  }

  //method to test grayScale
  public static void testGrayscale(){

    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();

  }

  //method to test fixUnderwater
  public static void testFixUnderwater(){

    Picture beach = new Picture("water.jpg");
    beach.explore();
    beach.fixUnderwater();
    beach.explore();

  }

  /** Method to test mirrorVerticalRightToLeft */
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }

  /** Method to test mirrorHorizontal */
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }

  /** Method to test mirrorHorizontalBotToTop */
  public static void testMirrorHorizontalBotToTop()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }

  /** Method to test mirrorDiagonal */
  public static void testMirrorDiagonal()
  {
    Picture caterpillar = new Picture("beach.jpg");
    caterpillar.explore();
    caterpillar.mirrorDiagonal();
    caterpillar.explore();
  }

  /** Method to test mirrorArms */
  public static void testMirrorArms()
  {
    Picture caterpillar = new Picture("snowman.jpg");
    caterpillar.explore();
    caterpillar.mirrorArms();
    caterpillar.explore();
  }

  /** Method to test mirrorGull */
  public static void testMirrorGull()
  {
    Picture caterpillar = new Picture("seagull.jpg");
    caterpillar.explore();
    caterpillar.mirrorGull();
    caterpillar.explore();
  }

  // Method to create a college
  public static void testMyCollage(){
    Picture coolCollage  = new Picture("640x480.jpg");

    coolCollage.myCollage();

    coolCollage.explore();

  }

  // Method to test chromakey
  public static void testChromaKey(){
    Picture greenScreen = new Picture("ground.jpg");
    Picture deadBoy = new Picture("deadBoy.jpg");

    greenScreen.chromakey(deadBoy);


    greenScreen.explore();

  }

  //Method to test encoding and decoding secret messages in images, aka steganography
  public static void testSteganography(){
    Picture beach = new Picture("beach.jpg");
    Picture msg = new Picture("msg.jpg");

    msg.explore();

    //encode the secret message
    beach.encode(msg);

    //Shows the the picture with the encoded message
    beach.explore();

    //Decodes message
    Picture decoded = beach.decode();

    //Shows the picture with the decoded message
    decoded.explore();


  }


  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run

    //testChromaKey();

    //testSteganography();



    //testMirrorArms();
    //testMirrorGull();
    testMyCollage();
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    //testMirrorDiagonal();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}