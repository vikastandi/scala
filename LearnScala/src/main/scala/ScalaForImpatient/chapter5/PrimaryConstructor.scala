package ScalaForImpatient.chapter5

// get java bytecode to understand what happens by running command ":javap -private ScalaForImpatient.chapter5.PrimaryConstructor" in Scala REPL
class PrimaryConstructor(a: String, b: String, val c: String, var d: String, private val e: String, private var f: String) {

  def get_a() = {
    this.a
  }
}

// bytecode
/* public class ScalaForImpatient.chapter5.PrimaryConstructor {
  private final java.lang.String a;
  private final java.lang.String c;
  private java.lang.String d;
  private final java.lang.String e;
  private java.lang.String f;
  public java.lang.String c();
  public java.lang.String d();
  public void d_$eq(java.lang.String);
  private java.lang.String e();
  private java.lang.String f();
  private void f_$eq(java.lang.String);
  public java.lang.String get_a();
  public ScalaForImpatient.chapter5.PrimaryConstructor(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String);
} */
