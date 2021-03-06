/*******************************************************************************
 * Copyright (c) 2020 University of Southampton.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package ac.soton.eventb.emf.record.tests;

import org.junit.Test;

import ac.soton.eventb.emf.record.Record;
import ac.soton.eventb.emf.record.RecordFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecordTest extends TestCase {

	/**
	 * The fixture for this Record test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Record fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RecordTest.class);
	}

	/**
	 * Constructs a new Record test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Record test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Record fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Record test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Record getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RecordFactory.eINSTANCE.createRecord());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	@Test
	public void testRecord() {
		// Ignore at the moment
	}
} //RecordTest
