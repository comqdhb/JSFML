package org.jsfml.window;

import org.jsfml.JSFMLException;
import org.jsfml.window.event.Event;

import javax.swing.*;

/**
 * Interface for windows that serve as OpenGL targets.
 */
public interface Window {
    /**
     * Creates a window or re-creates it if it was already opened.
     *
     * @param mode     The video mode to use for the OpenGL context. This must be a valid video mode in case
     *                 {@link WindowStyle#FULLSCREEN} is set.
     * @param title    The window title.
     * @param style    The style of the window.
     * @param settings The context settings to be applied to the context.
     * @see {@link WindowStyle}, {@link org.jsfml.window.VideoMode#isValid()}, {@link ContextSettings}
     */
    public void create(VideoMode mode, String title, long style, ContextSettings settings);

    /**
     * Creates a window or re-creates it if it was already opened with default context settings.
     *
     * @param mode  The video mode to use for the OpenGL context. This must be a valid video mode in case
     *              {@link WindowStyle#FULLSCREEN} is set.
     * @param title The window title.
     * @param style The style of the window.
     * @see {@link WindowStyle}, {@link org.jsfml.window.VideoMode#isValid()}
     */
    public void create(VideoMode mode, String title, long style);

    /**
     * Creates a window or re-creates it if it was already opened with default context settings and style
     * ({@link WindowStyle#DEFAULT}.
     *
     * @param mode  The video mode to use for the OpenGL context.
     * @param title The window title.
     */
    public void create(VideoMode mode, String title);

    /**
     * Closes the window and destroys all attached resources.
     */
    public void close();

    /**
     * Checks if the window has been created and is opened.
     * <p/>
     * The user can modify this property by clicking the window's close button.
     *
     * @return <tt>true</tt> if the window has been created and is currently opened.
     */
    public boolean isOpened();

    /**
     * Retrieves the width of the rendering region within the window.
     *
     * @return The width of the rendering region within the window.
     */
    public int getWidth();

    /**
     * Retrieves the height of the rendering region within the window.
     *
     * @return The height of the rendering region within the window.
     */
    public int getHeight();

    /**
     * Retrieves the context settings of the window's rendering context.
     *
     * @return The context settings of the window's rendering context.
     */
    public ContextSettings getSettings();

    /**
     * Pops the event on top of the event stack, if any, and returns it.
     *
     * @return The event currently on top of the event stack, or <tt>null</tt> if there is none.
     * @see {@link Window#waitEvent()} ()}
     */
    public Event pollEvent();

    /**
     * Pops the event on top of the event stack and returns it, or waits until an event occurs and then
     * returns it.
     * <p/>
     * Note that this method will block the program flow until an event is returned.
     *
     * @return The event currently on top of the event stack, or the next event that will occur.
     * @see {@link Window#pollEvent()} ()}
     */
    public Event waitEvent();

    /**
     * Enables or disables vertical synchronization (VSync).
     *
     * @param enable <tt>true</tt> to enable, <tt>false</tt> to disable.
     */
    public void enableVerticalSync(boolean enable);

    /**
     * Determines whether the mouse cursor, if moved over the window, is visible or not.
     *
     * @param show <tt>true</tt> to make the cursor visible, <tt>false</tt> to hide it.
     */
    public void showMouseCursor(boolean show);

    /**
     * Sets the position of the window on the screen.
     *
     * @param x The X position on the screen.
     * @param y The Y position on the screen.
     */
    public void setPosition(int x, int y);

    /**
     * Sets the size of the rendering region within the window.
     *
     * @param width  The width of the rendering region.
     * @param height The height of the rendering region.
     */
    public void setSize(int width, int height);

    /**
     * Sets the window's title.
     *
     * @param title The window's new title.
     */
    public void setTitle(String title);

    /**
     * Shows or hides the window.
     *
     * @param show <tt>true</tt> to show the window, <tt>false</tt> to hide it.
     */
    public void show(boolean show);

    /**
     * Determines whether automatic key repeat is enabled.
     * <p/>
     * If enabled, new key events will be fired when a key stays pressed (much like in a text field). This is
     * enabled by default.
     *
     * @param enable <tt>true</tt> to enable, <tt>false</tt> to disabled.
     */
    public void enableKeyRepeat(boolean enable);

    /**
     * Sets the icon of the window.
     *
     * @param icon The icon.
     * @throws JSFMLException In case an error occurs trying to convert the icon to an SFML-compatible format.
     */
    public void setIcon(Icon icon) throws JSFMLException;

    /**
     * Activates or deactivates the window as the current OpenGL rendering target.
     * <p/>
     * Note that if a window gets activated, all other windows operating in the same thread will
     * automatically be deactivated.
     *
     * @param active <tt>true</tt> to activate, <tt>false</tt> to deactivate.
     */
    public void setActive(boolean active);

    /**
     * Flushes the OpenGL pixel buffer to the screen.
     * <p/>
     * This should be called every frame to visibly update the scene.
     */
    public void display();

    /**
     * Sets the maximum frame rate in frames per second.
     *
     * @param flimit The maximum frame rate in frames per second.
     */
    public void setFramerateLimit(int flimit);

    /**
     * Retrieves the duration of the last frame in milliseconds.
     *
     * @return The duration of the last frame in milliseconds.
     */
    public long getFrameTime();

    /**
     * Sets the joystick treshold.
     * <p/>
     * Joystick axis movements with a magnitude smaller than this treshold will not fire a joystick event.
     * The default joystick treshold is 0.1.
     *
     * @param treshold The joystick treshold in a range between 0 and 100.
     * @see org.jsfml.window.event.JoystickMoveEvent
     */
    public void setJoystickTreshold(float treshold);

    /**
     * Retrieves the operating system handle of this window.
     *
     * @return The window's system handle.
     */
    public long getSystemHandle();
}