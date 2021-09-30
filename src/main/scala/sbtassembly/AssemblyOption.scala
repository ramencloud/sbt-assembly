/**
 * This code is generated using [[https://www.scala-sbt.org/contraband/ sbt-contraband]].
 */

package sbtassembly

/**
 * @param includeBin include compiled class files from itself or subprojects
 * @param includeDependency include class files from external dependencies
 */
final class AssemblyOption private (
  val assemblyDirectory: Option[java.io.File],
  val assemblyUnzipDirectory: Option[java.io.File],
  val includeBin: Boolean,
  val includeScala: Boolean,
  val includeDependency: Boolean,
  val excludedJars: sbt.Keys.Classpath,
  val excludedFiles: Seq[java.io.File] => Seq[java.io.File],
  val mergeStrategy: String => MergeStrategy,
  val cacheOutput: Boolean,
  val cacheUnzip: Boolean,
  val cacheUseHardLinks: Boolean, // Experimental, requires assemblyDirectory and assemblyUnzipDirectory to be on the same physical filesystem volume.
  val appendContentHash: Boolean,
  val prependShellScript: Option[Seq[String]],
  val maxHashLength: Option[Int],
  val shadeRules: Seq[com.eed3si9n.jarjarabrams.ShadeRule],
  val scalaVersion: String,
  val level: sbt.Level.Value) extends Serializable {

  private def this() = this(None, None, true, true, true, Nil, sbtassembly.Assembly.defaultExcludedFiles, sbtassembly.MergeStrategy.defaultMergeStrategy, true, true, false, false, None, None, Nil, "", sbt.Level.Info)

  override def equals(o: Any): Boolean = this.eq(o.asInstanceOf[AnyRef]) || (o match {
    case x: AssemblyOption => (this.assemblyDirectory == x.assemblyDirectory) && (this.assemblyUnzipDirectory == x.assemblyUnzipDirectory) && (this.includeBin == x.includeBin) && (this.includeScala == x.includeScala) && (this.includeDependency == x.includeDependency) && (this.excludedJars == x.excludedJars) && (this.excludedFiles == x.excludedFiles) && (this.mergeStrategy == x.mergeStrategy) && (this.cacheOutput == x.cacheOutput) && (this.cacheUnzip == x.cacheUnzip) && (this.appendContentHash == x.appendContentHash) && (this.prependShellScript == x.prependShellScript) && (this.maxHashLength == x.maxHashLength) && (this.shadeRules == x.shadeRules) && (this.scalaVersion == x.scalaVersion) && (this.level == x.level)
    case _ => false
  })

  override def hashCode: Int = {
    37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (17 + "sbtassembly.AssemblyOption".##) + assemblyDirectory.##) + assemblyUnzipDirectory.##) + includeBin.##) + includeScala.##) + includeDependency.##) + excludedJars.##) + excludedFiles.##) + mergeStrategy.##) + cacheOutput.##) + cacheUnzip.##) + cacheUseHardLinks.##) + appendContentHash.##) + prependShellScript.##) + maxHashLength.##) + shadeRules.##) + scalaVersion.##) + level.##)
  }

  override def toString: String = {
    "AssemblyOption(" + assemblyDirectory + ", " + assemblyUnzipDirectory + ", " + includeBin + ", " + includeScala + ", " + includeDependency + ", " + excludedJars + ", " + excludedFiles + ", " + mergeStrategy + ", " + cacheOutput + ", " + cacheUnzip + ", " + cacheUseHardLinks + ", " + appendContentHash + ", " + prependShellScript + ", " + maxHashLength + ", " + shadeRules + ", " + scalaVersion + ", " + level + ")"
  }

  @deprecated("copy method is deprecated; use withIncludeBin(...) etc", "1.0.0")
  def copy(assemblyDirectory: Option[java.io.File] = assemblyDirectory, assemblyUnzipDirectory: Option[java.io.File] = assemblyUnzipDirectory, includeBin: Boolean = includeBin, includeScala: Boolean = includeScala, includeDependency: Boolean = includeDependency, excludedJars: sbt.Keys.Classpath = excludedJars, excludedFiles: Seq[java.io.File] => Seq[java.io.File] = excludedFiles, mergeStrategy: String => MergeStrategy = mergeStrategy, cacheOutput: Boolean = cacheOutput, cacheUnzip: Boolean = cacheUnzip, cacheUseHardLinks: Boolean = cacheUseHardLinks, appendContentHash: Boolean = appendContentHash, prependShellScript: Option[Seq[String]] = prependShellScript, maxHashLength: Option[Int] = maxHashLength, shadeRules: Seq[com.eed3si9n.jarjarabrams.ShadeRule] = shadeRules, scalaVersion: String = scalaVersion, level: sbt.Level.Value = level): AssemblyOption = {
    cp(assemblyDirectory = assemblyDirectory,
      assemblyUnzipDirectory = assemblyUnzipDirectory,
      includeBin = includeBin,
      includeScala = includeScala,
      includeDependency = includeDependency,
      excludedJars = excludedJars,
      excludedFiles = excludedFiles,
      mergeStrategy = mergeStrategy,
      cacheOutput = cacheOutput,
      cacheUnzip = cacheUnzip,
      cacheUseHardLinks = cacheUseHardLinks,
      appendContentHash = appendContentHash,
      prependShellScript = prependShellScript,
      maxHashLength = maxHashLength,
      shadeRules = shadeRules,
      scalaVersion = scalaVersion,
      level = level
    )
  }

  private def cp(assemblyDirectory: Option[java.io.File] = assemblyDirectory, assemblyUnzipDirectory: Option[java.io.File] = assemblyUnzipDirectory, includeBin: Boolean = includeBin, includeScala: Boolean = includeScala, includeDependency: Boolean = includeDependency, excludedJars: sbt.Keys.Classpath = excludedJars, excludedFiles: Seq[java.io.File] => Seq[java.io.File] = excludedFiles, mergeStrategy: String => MergeStrategy = mergeStrategy, cacheOutput: Boolean = cacheOutput, cacheUnzip: Boolean = cacheUnzip, cacheUseHardLinks: Boolean = cacheUseHardLinks, appendContentHash: Boolean = appendContentHash, prependShellScript: Option[Seq[String]] = prependShellScript, maxHashLength: Option[Int] = maxHashLength, shadeRules: Seq[com.eed3si9n.jarjarabrams.ShadeRule] = shadeRules, scalaVersion: String = scalaVersion, level: sbt.Level.Value = level): AssemblyOption = {
    new AssemblyOption(assemblyDirectory, assemblyUnzipDirectory, includeBin, includeScala, includeDependency, excludedJars, excludedFiles, mergeStrategy, cacheOutput, cacheUnzip, cacheUseHardLinks, appendContentHash, prependShellScript, maxHashLength, shadeRules, scalaVersion, level)
  }

  def withAssemblyDirectory(assemblyDirectory: Option[java.io.File]): AssemblyOption = {
    cp(assemblyDirectory = assemblyDirectory)
  }
  def withAssemblyDirectory(assemblyDirectory: java.io.File): AssemblyOption = {
    cp(assemblyDirectory = Option(assemblyDirectory))
  }
  def withAssemblyUnzipDirectory(assemblyUnzipDirectory: Option[java.io.File]): AssemblyOption = {
    cp(assemblyUnzipDirectory = assemblyUnzipDirectory)
  }
  def withAssemblyUnzipDirectory(assemblyUnzipDirectory: java.io.File): AssemblyOption = {
    cp(assemblyUnzipDirectory = Option(assemblyUnzipDirectory))
  }
  def withIncludeBin(includeBin: Boolean): AssemblyOption = {
    cp(includeBin = includeBin)
  }
  def withIncludeScala(includeScala: Boolean): AssemblyOption = {
    cp(includeScala = includeScala)
  }
  def withIncludeDependency(includeDependency: Boolean): AssemblyOption = {
    cp(includeDependency = includeDependency)
  }
  def withExcludedJars(excludedJars: sbt.Keys.Classpath): AssemblyOption = {
    cp(excludedJars = excludedJars)
  }
  def withExcludedFiles(excludedFiles: Seq[java.io.File] => Seq[java.io.File]): AssemblyOption = {
    cp(excludedFiles = excludedFiles)
  }
  def withMergeStrategy(mergeStrategy: String => MergeStrategy): AssemblyOption = {
    cp(mergeStrategy = mergeStrategy)
  }
  def withCacheOutput(cacheOutput: Boolean): AssemblyOption = {
    cp(cacheOutput = cacheOutput)
  }
  def withCacheUnzip(cacheUnzip: Boolean): AssemblyOption = {
    cp(cacheUnzip = cacheUnzip)
  }
  def withCacheUseHardLinks(cacheUseHardLinks: Boolean): AssemblyOption = {
    cp(cacheUseHardLinks = cacheUseHardLinks)
  }
  def withAppendContentHash(appendContentHash: Boolean): AssemblyOption = {
    cp(appendContentHash = appendContentHash)
  }
  def withPrependShellScript(prependShellScript: Option[Seq[String]]): AssemblyOption = {
    cp(prependShellScript = prependShellScript)
  }
  def withPrependShellScript(prependShellScript: Seq[String]): AssemblyOption = {
    cp(prependShellScript = Option(prependShellScript))
  }
  def withMaxHashLength(maxHashLength: Option[Int]): AssemblyOption = {
    cp(maxHashLength = maxHashLength)
  }
  def withMaxHashLength(maxHashLength: Int): AssemblyOption = {
    cp(maxHashLength = Option(maxHashLength))
  }
  def withShadeRules(shadeRules: Seq[com.eed3si9n.jarjarabrams.ShadeRule]): AssemblyOption = {
    cp(shadeRules = shadeRules)
  }
  def withScalaVersion(scalaVersion: String): AssemblyOption = {
    cp(scalaVersion = scalaVersion)
  }
  def withLevel(level: sbt.Level.Value): AssemblyOption = {
    cp(level = level)
  }
}

object AssemblyOption {
  def apply(): AssemblyOption = new AssemblyOption()
  // 1.0 and 1.1 Compat
  def apply(assemblyDirectory: Option[java.io.File], includeBin: Boolean, includeScala: Boolean, includeDependency: Boolean, excludedJars: sbt.Keys.Classpath, excludedFiles: Seq[java.io.File] => Seq[java.io.File], mergeStrategy: String => MergeStrategy, cacheOutput: Boolean, cacheUnzip: Boolean, appendContentHash: Boolean, prependShellScript: Option[Seq[String]], maxHashLength: Option[Int], shadeRules: Seq[com.eed3si9n.jarjarabrams.ShadeRule], scalaVersion: String, level: sbt.Level.Value): AssemblyOption = new AssemblyOption(assemblyDirectory, None,includeBin, includeScala, includeDependency, excludedJars, excludedFiles, mergeStrategy, cacheOutput, cacheUnzip, false, appendContentHash, prependShellScript, maxHashLength, shadeRules, scalaVersion, level)
  def apply(assemblyDirectory: java.io.File, includeBin: Boolean, includeScala: Boolean, includeDependency: Boolean, excludedJars: sbt.Keys.Classpath, excludedFiles: Seq[java.io.File] => Seq[java.io.File], mergeStrategy: String => MergeStrategy, cacheOutput: Boolean, cacheUnzip: Boolean, appendContentHash: Boolean, prependShellScript: Seq[String], maxHashLength: Int, shadeRules: Seq[com.eed3si9n.jarjarabrams.ShadeRule], scalaVersion: String, level: sbt.Level.Value): AssemblyOption = new AssemblyOption(Option(assemblyDirectory), None, includeBin, includeScala, includeDependency, excludedJars, excludedFiles, mergeStrategy, cacheOutput, cacheUnzip, false, appendContentHash, Option(prependShellScript), Option(maxHashLength), shadeRules, scalaVersion, level)
  // Current API
  def apply(assemblyDirectory: Option[java.io.File], assemblyUnzipDirectory: Option[java.io.File], includeBin: Boolean, includeScala: Boolean, includeDependency: Boolean, excludedJars: sbt.Keys.Classpath, excludedFiles: Seq[java.io.File] => Seq[java.io.File], mergeStrategy: String => MergeStrategy, cacheOutput: Boolean, cacheUnzip: Boolean, cacheUseHardLinks: Boolean, appendContentHash: Boolean, prependShellScript: Option[Seq[String]], maxHashLength: Option[Int], shadeRules: Seq[com.eed3si9n.jarjarabrams.ShadeRule], scalaVersion: String, level: sbt.Level.Value): AssemblyOption = new AssemblyOption(assemblyDirectory, assemblyUnzipDirectory, includeBin, includeScala, includeDependency, excludedJars, excludedFiles, mergeStrategy, cacheOutput, cacheUnzip, cacheUseHardLinks, appendContentHash, prependShellScript, maxHashLength, shadeRules, scalaVersion, level)
  def apply(assemblyDirectory: java.io.File, assemblyUnzipDirectory: java.io.File, includeBin: Boolean, includeScala: Boolean, includeDependency: Boolean, excludedJars: sbt.Keys.Classpath, excludedFiles: Seq[java.io.File] => Seq[java.io.File], mergeStrategy: String => MergeStrategy, cacheOutput: Boolean, cacheUnzip: Boolean, cacheUseHardLinks: Boolean, appendContentHash: Boolean, prependShellScript: Seq[String], maxHashLength: Int, shadeRules: Seq[com.eed3si9n.jarjarabrams.ShadeRule], scalaVersion: String, level: sbt.Level.Value): AssemblyOption = new AssemblyOption(Option(assemblyDirectory), Option(assemblyUnzipDirectory), includeBin, includeScala, includeDependency, excludedJars, excludedFiles, mergeStrategy, cacheOutput, cacheUnzip, cacheUseHardLinks, appendContentHash, Option(prependShellScript), Option(maxHashLength), shadeRules, scalaVersion, level)
}
