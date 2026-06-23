# Add project specific ProGuard rules here.
-keepattributes Signature
-keepattributes *Annotation*

# Moshi
-dontwarn okio.**
-dontwarn com.squareup.moshi.**
-keep class com.example.internetapp.model.** { *; }

# Retrofit
-dontwarn retrofit2.**
-keep class retrofit2.** { *; }

# Glide
-keep public class * implements com.bumptech.glide.module.GlideModule
-keep class com.bumptech.glide.** { *; }
