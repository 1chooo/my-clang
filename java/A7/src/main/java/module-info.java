module stu_109601003.a7 {
  requires javafx.controls;
  requires javafx.fxml;

  requires org.controlsfx.controls;
  requires com.dlsc.formsfx;
  requires org.kordamp.bootstrapfx.core;

  opens stu_109601003.a7 to javafx.fxml;
  exports stu_109601003.a7;
}