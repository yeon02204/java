package inner_class;

public class Button {
   interface OnclickListener{
      void onClick();
   }
   
   void setOnclickListener(OnclickListener listener) {
      listener.onClick();
   }
   public void click() {
	   
   }
}
