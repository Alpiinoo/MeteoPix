# MeteoPix 🚀

A classic space shooter game built in Java where you control a spaceship and defend against incoming asteroids!

![MeteoPix Game](res/Spaceship.png)

## 🎮 Game Overview

MeteoPix is an exciting 2D space shooter game where you pilot a spaceship through a scrolling space background. Your mission is to shoot down incoming asteroids before they collide with your ship. The game features smooth controls, dynamic asteroid spawning, explosion effects, and a scoring system.

## ✨ Features

- **Smooth Space Combat**: Control your spaceship with precise movement and shooting mechanics
- **Dynamic Asteroid Spawning**: Asteroids spawn randomly with varying sizes and positions
- **Visual Effects**: Beautiful explosion animations when asteroids are destroyed
- **Sound Effects**: Immersive audio feedback for shooting and explosions
- **Scoring System**: Track your progress as you destroy more asteroids
- **Scrolling Background**: Dynamic space background that creates a sense of movement
- **Collision Detection**: Realistic collision system between bullets, asteroids, and spaceship

## 🎯 How to Play

### Controls
- **Arrow Keys**: Move your spaceship
  - `↑` Move up
  - `↓` Move down  
  - `←` Move left
  - `→` Move right
- **Spacebar**: Shoot bullets

### Objective
- Destroy incoming asteroids by shooting them with your spaceship
- Avoid colliding with asteroids - any collision will end the game
- Try to achieve the highest score possible!

## 🛠️ Technical Details

### Architecture
The game is built using a modular architecture with clear separation of concerns:

- **Core Package**: Contains the main game loop, window management, input handling, and utility classes
- **Objects Package**: Game entities like Spaceship, Asteroid, Bullet, and Background
- **Render Package**: Rendering system for drawing game objects
- **Update Package**: Game logic and object updates
- **Effects Package**: Visual effects like explosions

### Key Components

#### Game Loop
- **Entry.java**: Main entry point that initializes the game
- **Window.java**: JFrame-based game window management
- **FPS.java**: Frame rate and delta time calculation for smooth gameplay

#### Game Objects
- **Spaceship**: Player-controlled ship with movement and shooting capabilities
- **Asteroid**: Enemy objects that spawn randomly and move downward
- **Bullet**: Projectiles fired by the spaceship
- **Background**: Scrolling space background for visual depth

#### Systems
- **Renderer**: Handles all visual rendering with layer-based drawing
- **Updater**: Manages game object updates and logic
- **Input**: Keyboard input handling for player controls
- **Sound**: Audio playback system for game effects

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

### Installation & Running

1. **Clone or download** the project files
2. **Open the project** in your Java IDE
3. **Set the source folder**: Make sure `src/` is marked as a source folder
4. **Run the game**: Execute `core.Entry.java` as the main class

### Project Structure
```
MeteoPix/
├── src/
│   ├── core/           # Core game systems
│   ├── objects/        # Game objects (spaceship, asteroids, etc.)
│   ├── render/         # Rendering system
│   ├── update/         # Game update logic
│   └── effects/        # Visual effects
├── res/                # Game resources (images, sounds)
├── out/                # Compiled output
└── README.md           # This file
```

## 🎨 Game Assets

The game includes various visual and audio assets:
- **Spaceship sprite**: Player character
- **Asteroid sprites**: Enemy objects
- **Bullet sprite**: Projectile graphics
- **Background images**: Scrolling space backgrounds
- **Explosion animations**: Sprite sheet for explosion effects
- **Sound effects**: Shooting and explosion audio

## 🔧 Customization

You can easily customize the game by modifying various parameters:

### Game Balance
- **Asteroid spawn rate**: Modify `spawnTimeMillis` in `AstreoidSpawner.java`
- **Asteroid speed**: Change `speed` variable in `Astreoid.java`
- **Spaceship speed**: Adjust `speed` variable in `Spaceship.java`
- **Bullet speed**: Modify `speed` variable in `Bullet.java`

### Visual Customization
- Replace sprite images in the `res/` folder
- Modify background images for different visual themes
- Adjust explosion animation parameters in `Explosion.java`

## 🎯 Future Enhancements

Potential improvements for the game:
- Power-ups and special weapons
- Multiple asteroid types with different behaviors
- Boss battles
- High score persistence
- Multiple difficulty levels
- Particle effects and additional visual polish
- Background music
- Multiplayer support

## 🤝 Contributing

Feel free to contribute to this project by:
- Adding new features
- Improving game balance
- Enhancing visual effects
- Optimizing performance
- Adding new game modes

## 📝 License

This project is open source and available under the MIT License.

---

**Enjoy playing MeteoPix!** 🚀✨

*Shoot those asteroids and achieve the highest score!*
