//
// MIT License
// 
// Copyright (c) 2020 minecraft.kiwi
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in all
// copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
// SOFTWARE.
// 
package at.joestr.cartjets.models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import org.bukkit.Location;

/**
 *
 * @author Joel
 */
@DatabaseTable(tableName = "cartjets")
public class CartJetsModel {
  @DatabaseField(id = true)
  private String name;
  @DatabaseField(persisterClass = LocationPersister.class)
  private Location buttonLocation;
  @DatabaseField(persisterClass = LocationPersister.class)
  private Location minecartSpawningLocation;

  public CartJetsModel() {
  }

  public CartJetsModel(String name, Location buttonLocation, Location minecartSpawningLocation) {
    this.name = name;
    this.buttonLocation = buttonLocation;
    this.minecartSpawningLocation = minecartSpawningLocation;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Location getButtonLocation() {
    return buttonLocation;
  }

  public void setButtonLocation(Location buttonLocation) {
    this.buttonLocation = buttonLocation;
  }

  public Location getMinecartSpawningLocation() {
    return minecartSpawningLocation;
  }

  public void setMinecartSpawningLocation(Location minecartSpawningLocation) {
    this.minecartSpawningLocation = minecartSpawningLocation;
  }
}
