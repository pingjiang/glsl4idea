/*
 *     Copyright 2010 Jean-Paul Balabanian and Yngve Devik Hammersland
 *
 *     This file is part of glsl4idea.
 *
 *     Glsl4idea is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as
 *     published by the Free Software Foundation, either version 3 of
 *     the License, or (at your option) any later version.
 *
 *     Glsl4idea is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with glsl4idea.  If not, see <http://www.gnu.org/licenses/>.
 */

package glslplugin.lang.elements.statements;

import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import glslplugin.lang.elements.expressions.GLSLExpression;
import glslplugin.lang.elements.declarations.GLSLDeclarationStatement;
import glslplugin.lang.elements.declarations.GLSLVariableDeclaration;
import org.jetbrains.annotations.NotNull;

/**
 * GLSLDeclarationStatement is ...
 *
 * @author Yngve Devik Hammersland
 *         Date: Jan 28, 2009
 *         Time: 6:13:58 PM
 */
public class GLSLWhileStatement extends GLSLStatement implements ConditionStatement {
    public GLSLWhileStatement(@NotNull ASTNode astNode) {
        super(astNode);
    }

    public GLSLExpression getConditionExpression() {
        return findChildByClass(GLSLExpression.class);
    }
    
    GLSLStatement getLoopStatement() {
        GLSLStatement loop = findChildByClass(GLSLStatement.class);
        assert loop != null;
        return loop;
    }

    @Override
    public String toString() {
        return "While Loop";
    }
}