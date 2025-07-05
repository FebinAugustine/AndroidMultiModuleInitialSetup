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
