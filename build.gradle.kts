import com.guidovezzoni.greeting.Greeting

//apply<com.guidovezzoni.greeting.GreetingPlugin>()
plugins {
  id("com.guidovezzoni.greeting")
  id("java-gradle-plugin")
}

tasks.getByName<Greeting>("hello") {
    message = "Hi"
    recipient = "Gradle"
}
