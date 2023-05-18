/**
 * Copyright (C) 2023 Nick Donovan
 * <p>
 * This file is part of jSimpleArgs.
 * <p>
 * jSimpleArgs is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * jSimpleArgs is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with jSimpleArgs. If not, see <http://www.gnu.org/licenses/>.
 * <p>
 * A generic exception for the library and can act as a wrapper exception class for easy handling. All other exceptions
 * should throw to a InvalidInputException to limit the need for multiple catches or throw declarations.
 */


package dev.nicholasdonovan.jsimpleargs.exceptions;

/**
 * A generic exception for the library and can act as a wrapper exception class for easy handling. All other exceptions
 * should throw to a InvalidInputException to limit the need for multiple catches or throw declarations.
 */
public class InvalidInputException extends Exception {
  /** Constructs a new InvalidInputException with a default message. */
  public InvalidInputException() {
    super();
  }

  /**
   * Constructs a new InvalidInputException with a specified message.
   *
   * @param message the error message
   */
  public InvalidInputException(String message) {
    super(message);
  }

  /**
   * Constructs a new InvalidInputException with the specified error message and cause.
   *
   * @param message the error message
   * @param cause   the cause of the exception
   */
  public InvalidInputException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * Constructs a new InvalidInputException with the specific cause.
   *
   * @param cause the cause of the exception
   */
  public InvalidInputException(Throwable cause) {
    super(cause);
  }
}
