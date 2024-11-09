# Mario Flappy Bird Clone

A Java implementation of a Flappy Bird-style game featuring Mario characters. Players control various Nintendo characters (Mario, Luigi, Wario, or a turtle) as they navigate through pipes in a side-scrolling environment.

## 🎮 Game Features

- Multiple playable characters (Mario, Luigi, Wario, Turtle)
- Classic side-scrolling gameplay
- Score tracking with high score system
- Dynamic obstacle generation
- Responsive controls
- Custom graphics and backgrounds

## 🕹️ Controls

- **SPACE**: Jump/Flap
- **ENTER**: Start game
- **R**: Restart game after game over
- **LEFT/RIGHT ARROWS**: Change character in main menu

## 🛠️ Technical Implementation

### Core Components

1. **GameEngine**: Main game loop and state management
   - Handles game initialization
   - Manages game states (menu, running, game over)
   - Controls frame rate (60 FPS)
   - Coordinates all game objects

2. **Character**: Player character management
   - Physics-based movement with gravity
   - Jump mechanics
   - Collision detection boundaries
   - Multiple character sprites

3. **Tubes**: Obstacle system
   - Dynamically generated pipes
   - Variable heights
   - Automatic scrolling
   - Collision boundaries

4. **CollisionDetector**: Game physics
   - Handles collision between character and tubes
   - Manages score increment zones
   - Precise hitbox detection

### Architecture

The game uses a component-based architecture with the following structure:

```
├── GameEngine (Main game controller)
├── GameObjects
│   ├── Character (Player character)
│   ├── DisplayScore (Score system)
│   ├── Scoreline (Score detection)
│   ├── Structures
│   │   └── Tubes (Obstacles)
│   └── Menu
│       └── Background (UI elements)
└── Controller (Input handling)
```

## 🎨 Visual Elements

- Custom background images
- Character sprites for multiple playable characters
- Animated tubes and obstacles
- Menu screens (main menu, game over)
- Score display
- Fire effects

## 🔧 Dependencies

- Simple Graphics Library (`org.academiadecodigo.simplegraphics`)
- Java Standard Library

## 🚀 Getting Started

1. Clone the repository
2. Ensure you have Java installed
3. Add the Simple Graphics Library to your project
4. Run the `Main` class

## 📁 Resource Requirements

The following resources are needed in the `resources` directory:
- `mario.png`
- `luigi.png`
- `wario.png`
- `turtle.png`
- `tube_low.png`
- `tube_mid.png`
- `tube_high.png`
- `tube_vhigh.png`
- `mainmenu.png`
- `gameover_mario.JPG`
- `background2.jpg`
- `fire_bottom.png`

## 🎯 Game Mechanics

- Character constantly falls due to gravity
- Press SPACE to make the character jump/flap
- Navigate through gaps between tubes
- Score increases when passing through tubes
- Game ends on collision with tubes or screen boundaries
- High score is tracked between attempts

## 💻 Technical Details

- Fixed framerate of 60 FPS
- Grid-based positioning system
- Event-driven keyboard input handling
- Collision detection using rectangular boundaries
- Score tracking with persistent high score
