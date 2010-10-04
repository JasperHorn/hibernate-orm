/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// $Id: BlobTest.java 20721 2010-09-27 12:40:10Z hardy.ferentschik $

package org.hibernate.jpamodelgen.test.embeddablemappedsuperclass;

import org.testng.annotations.Test;

import org.hibernate.jpamodelgen.test.util.CompilationTest;

import static org.hibernate.jpamodelgen.test.util.TestUtil.assertMetamodelClassGeneratedFor;
import static org.hibernate.jpamodelgen.test.util.TestUtil.assertNoCompilationError;

/**
 * @author Hardy Ferentschik
 */
public class EmbeddableMappedSuperClassTest extends CompilationTest {
	/**
	 * METAGEN-36
	 */
	@Test
	public void testMetaModelsGenerated() {
		assertMetamodelClassGeneratedFor( EmbeddableAndMappedSuperClass.class );
		assertNoCompilationError(getCompilationDiagnostics());
	}

	@Override
	protected String getPackageNameOfTestSources() {
		return EmbeddableMappedSuperClassTest.class.getPackage().getName();
	}
}