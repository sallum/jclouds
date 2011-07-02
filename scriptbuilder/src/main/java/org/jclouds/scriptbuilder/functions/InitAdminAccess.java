/**
 *
 * Copyright (C) 2011 Cloud Conscious, LLC. <info@cloudconscious.com>
 *
 * ====================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ====================================================================
 */
package org.jclouds.scriptbuilder.functions;

import javax.inject.Inject;

import org.jclouds.scriptbuilder.domain.AdminAccessVisitor;
import org.jclouds.scriptbuilder.statements.login.AdminAccess;
import org.jclouds.scriptbuilder.statements.login.AdminAccess.Configuration;

/**
 * 
 * @author Adrian Cole
 */
public class InitAdminAccess extends AdminAccessVisitor {
   private final AdminAccess.Configuration adminAccessConfiguration;

   @Inject
   public InitAdminAccess(Configuration adminAccessConfiguration) {
      this.adminAccessConfiguration = adminAccessConfiguration;
   }

   @Override
   public void visit(AdminAccess input) {
      input.init(adminAccessConfiguration);
   }
}