import com.guidovezzoni.appcenter.Greeting

//apply<com.guidovezzoni.appcenter.GreetingPlugin>()
plugins {
  id("com.guidovezzoni.appcenter")
  id("java-gradle-plugin")
}

tasks.getByName<Greeting>("hello") {
    message = "Hi"
    recipient = "Gradle"
}
