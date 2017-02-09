package pixLab.classes;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Seth Morris
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
  
  public static void testValentinesMeme()
  {
	  Picture meme = new Picture("beach.jpg");
	  meme.valentinesMeme();
	  meme.addMessage("TRIES TO MAKE VALENTINES MEME", 35, 68);
	  meme.addMessage("EVEN MY COMPUTER REJECTS ME", 55, 368);
	  meme.write("MyMeme");
	  meme.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture bike = new Picture("blueMotorcycle.jpg");
	  bike.explore();
	  bike.mirrorVerticalRightToLeft();
	  bike.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	  Picture bike = new Picture("blueMotorcycle.jpg");
	  bike.explore();
	  bike.mirrorHorizontal();
  }
  
  public static void testMirrorDiagonal()
  {
	  Picture bike = new Picture("blueMotorcycle.jpg");
	  Picture koala = new Picture("koala.jpg");
	  bike.explore();
	  koala.explore();
	  bike.mirrorDiagonal();
	  koala.mirrorDiagonalUphill();
	  bike.mirrorDiagonalUphill();
	  bike.explore();
	  koala.write("fancyMirror.jpg");
	  bike.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
	  Picture glasses = new Picture("glasses.jpg");
	  //glasses.explore();
	  glasses.mirrorHorizontal();
	  glasses.mirrorSeagull();
	  glasses.zeroBlue();
	  glasses.mirrorHorizontal();
	  glasses.mirrorTemple();
	  glasses.write("Trippin.jpg");
	  glasses.explore();
	  
  }
  
  
  public static void testMirrorSeagull()
  {
    Picture birdie = new Picture("seagull.jpg");
    birdie.explore();
    birdie.mirrorSeagull();
    birdie.explore();
  }
  
  
  public static void testMirrorArms()
  {
	  Picture snowman = new Picture("snowman.jpg");
	  snowman.explore();
	  snowman.mirrorArms();
	  snowman.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("kitten2.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testCopyCat()
  {
	  
  }
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture glasses = new Picture("glasses.jpg");
    glasses.edgeDetection(10);
    glasses.explore();
  }
  
  public static void testEdgeDetective()
  {
	Picture carmen = new Picture("carmen.jpg");
    Picture glasses = new Picture("glasses.jpg");
    
    carmen.explore();
    carmen.edgeDetective(10);
    carmen.explore();
    
    glasses.explore();
    glasses.edgeDetective(10);
    glasses.edgeDetective(20);
    glasses.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
   // testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
	//  testMirrorDiagonal();
    //testMirrorTemple();
	//                           testMirrorSeagull();
    //                           testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //                           testCollage();
    //testCopy();
    //testEdgeDetection();
    //                           testEdgeDetective();
	  testValentinesMeme();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}