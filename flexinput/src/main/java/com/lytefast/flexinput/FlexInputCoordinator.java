package com.lytefast.flexinput;

import com.lytefast.flexinput.managers.FileManager;
import com.lytefast.flexinput.model.Attachment;
import com.lytefast.flexinput.utils.SelectionCoordinator;


/**
 * Defines methods used to co-ordinate events and setup needed for the FlexInput components to
 * function with eachother.
 *
 * @author Sam Shih
 */
public interface FlexInputCoordinator {
  FileManager getFileManager();

  /**
   * Notify the {@link FlexInputCoordinator} that items from a collection are selectable.
   * This is the primary means to add items to the FlexInput message.
   *
   * @param coordinator instance that manages a collection of selectable items
   * @param <T> Type of item that can be selected.
   */
  <T extends Attachment> void addSelectionCoordinator(SelectionCoordinator<T> coordinator);

  <T extends Attachment> void onPhotoTaken(T photo);
}