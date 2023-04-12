public class SizeOfPrimitiveType{
  public void mostrar(){
    System.out.println("sizeof(byte) = "+Byte.SIZE+" bits o "+Byte.SIZE/8+" bytes");
    System.out.println("sizeof(char) = "+Character.SIZE+" bits o "+Character.SIZE/8+" bytes");
    System.out.println("sizeof(short) = "+Short.SIZE+" bits o "+Short.SIZE/8 + "bytes");
    System.out.println("sizeof(int) = "+Integer.SIZE+" bits o "+Integer.SIZE/8+" bytes");
    //System.out.println("sizeof(long) = "+ Long.SIZE/8);
    //System.out.println("sizeof(float) = "+Float.SIZE/8);
    System.out.println("sizeof(double) = "+Double.SIZE+" bits o "+Double.SIZE/8+" bytes");
}
}