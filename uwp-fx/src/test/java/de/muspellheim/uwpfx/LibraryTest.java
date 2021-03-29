/*
 * UWP FX
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.uwpfx;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LibraryTest {
  @Test
  void testSomeLibraryMethod() {
    Library classUnderTest = new Library();
    assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
  }
}
