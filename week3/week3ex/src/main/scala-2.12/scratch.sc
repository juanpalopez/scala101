import week3.{Cons, Nil}

def error(msg:String) = throw new Error(msg)
//error("test")

val x = null
val y:String = x

//Can't initialize any subtype of AnyVal to null
//val z:Int = null

if (true) 1 else false

val c = new Cons[Int](2, new Nil)

