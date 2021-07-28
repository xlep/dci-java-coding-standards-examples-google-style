package com.company.project.application;

// imports should never use wildcards
import com.company.project.application.configuration.FileStructureConfig;

/**
 * Example class that no longer contains bad style.
 */
public class FileStructure {
  private final FileStructureConfig fileStructureConfig = new FileStructureConfig();
  // Source code files should never declare multiple classes at the top level
  // moved the FileStructureProperties class to it's own file.
}
