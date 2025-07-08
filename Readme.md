# Initial Setup For Multi-Modular Android Mobile App

## Create a new project
## Create the core module with 3 layers as the first separate module in the root folder
### 1. Data
### 2. Domain
### 3. Presentation
* designSystem
* ui

## Create a separate Build Logic for handling gradle configurations
### Create convention plugins
* Android Application Convention Plugin
  * Create additional kotlin utility files in the java.com.yourDomainName.convention folder
    * Project Extension
    * Extension Types
    * Kotlin
    * Build Types
* Android Application Compose Convention Plugin
  * Create a utility function Android Compose
  #### Moved build feature and compose dependencies to build logic convention plugin
* Android Library Convention Plugin
  * Used in the android library module that does not use compose, like data layer
* Android Library Compose Convention Plugin
  * This is for presentation layer in core module where design system and ui are there.
* Android Feature Ui Convention Plugin
  * This is for all feature presentation layer modules
* Android Room Convention Plugin
  * This is for Room database
* Android JVM Library Convention Plugin
  * for Domain layers
  * Kotlin Library
  * add kotlin specific JVM configuration to Kotlin utility file