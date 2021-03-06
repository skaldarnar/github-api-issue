/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package de.skaldarnar.github;

import java.io.IOException;

import org.kohsuke.github.GHOrganization;
import org.kohsuke.github.GitHub;

public class Main {

    public static void main(String[] args) {
        try {
            GitHub github = GitHub.connectAnonymously();
            GHOrganization movingBlocks = github.getOrganization("MovingBlocks");
      
            System.out.println(movingBlocks.toString());
          } catch (IOException e) {
            e.printStackTrace();
          }
    }
}
