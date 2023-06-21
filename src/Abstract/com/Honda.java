package Abstract.com;
   class Honda extends Bike {
      @Override
      void run(){
         System.out.println(" this is override method");
         super.speed();
      }
      void speed(){
         System.out.println(" test speed");
      }
}
