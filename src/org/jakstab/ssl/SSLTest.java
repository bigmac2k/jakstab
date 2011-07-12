/*
 * SSLTest.java - This file is part of the Jakstab project.
 * Copyright 2007-2011 Johannes Kinder <kinder@cs.tu-darmstadt.de>
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, see <http://www.gnu.org/licenses/>.
 */

package org.jakstab.ssl;

import antlr.ANTLRException;

/**
 * @author Johannes Kinder
 */
public class SSLTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		if (args.length < 1) {
			System.out.println("Usage: parse filename");
			return;
		}

		Architecture sslLib = null;
		try {
			sslLib = new Architecture(args[0]);
		} catch (ANTLRException e)  {
			e.printStackTrace();
			System.exit(1);
		}
		
		sslLib.dumpToConsole();
	}

}
